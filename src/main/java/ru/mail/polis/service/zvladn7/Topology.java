package ru.mail.polis.service.zvladn7;

import org.jetbrains.annotations.NotNull;

import java.nio.ByteBuffer;

/**
 * Topology to represent the node of cluster.
 * @param <N> - identifier of node
 */
public interface Topology<N> {

    @NotNull
    N nodeFor(@NotNull ByteBuffer key);

    boolean isLocal(@NotNull String node);

    int size();

    N[] nodes();

    N local();

}
