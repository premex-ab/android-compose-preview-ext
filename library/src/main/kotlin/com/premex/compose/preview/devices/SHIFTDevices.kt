package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SHIFT device specifications for Android Compose previews.
 *
 * This extension provides SHIFT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SHIFT.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SHIFT: Any
  get() = object {
      /** SHIFT axolotl */
      val AXOLOTL = "spec:width=1080,height=2160,unit=px,dpi=420"

      /** SHIFT otter */
      val OTTER = "spec:width=1080,height=2400,unit=px,dpi=420"

      /** SHIFT SHIFT6m */
      val SHIFT6M = "spec:width=1080,height=1920,unit=px,dpi=420"

  }
