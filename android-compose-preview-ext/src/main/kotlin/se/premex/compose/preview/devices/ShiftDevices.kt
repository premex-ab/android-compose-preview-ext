package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * SHIFT device specifications for Android Compose previews.
 *
 * This extension provides SHIFT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Shift.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Shift: Any
  get() = object {
      /** SHIFT axolotl */
      val AXOLOTL = "spec:width=1080,height=2160,unit=px,dpi=420"

      /** SHIFT otter */
      val OTTER = "spec:width=1080,height=2400,unit=px,dpi=420"

      /** SHIFT SHIFT6m */
      val SHIFT6M = "spec:width=1080,height=1920,unit=px,dpi=420"

  }
