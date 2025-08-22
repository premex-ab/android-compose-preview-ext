package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * XD-Enjoy device specifications for Android Compose previews.
 *
 * This extension provides XD-Enjoy device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.XdEnjoy.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.XdEnjoy: Any
  get() = object {
      /** XD-Enjoy XDDGM10 */
      val XDDGM10 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** XD-Enjoy XDDGM11BS */
      val XDDGM11BS = "spec:width=800,height=1280,unit=px,dpi=160"

      /** XD-Enjoy XDDGM99PM */
      val XDDGM99PM = "spec:width=800,height=1280,unit=px,dpi=213"

  }
