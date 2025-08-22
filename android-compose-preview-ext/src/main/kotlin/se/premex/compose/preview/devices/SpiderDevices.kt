package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Spider device specifications for Android Compose previews.
 *
 * This extension provides Spider device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Spider.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Spider: Any
  get() = object {
      /** Spider Spider_A10 */
      val SPIDER_A10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Spider Spider_M10Pro */
      val SPIDER_M10PRO = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
