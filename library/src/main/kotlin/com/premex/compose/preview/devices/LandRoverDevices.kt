package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LandRover device specifications for Android Compose previews.
 *
 * This extension provides LandRover device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LandRover.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LandRover: Any
  get() = object {
      /** LandRover LRExplore */
      val LREXPLORE = "spec:width=1080,height=1920,unit=px,dpi=420"

      /** LandRover LRExploreR */
      val LREXPLORER = "spec:width=720,height=1440,unit=px,dpi=280"

  }
