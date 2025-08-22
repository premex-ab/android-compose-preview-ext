package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * POOLS device specifications for Android Compose previews.
 *
 * This extension provides POOLS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Pools.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Pools: Any
  get() = object {
      /** POOLS POOLS_The_DOLLAR */
      val POOLS_THE_DOLLAR = "spec:width=1080,height=2220,unit=px,dpi=440"

  }
