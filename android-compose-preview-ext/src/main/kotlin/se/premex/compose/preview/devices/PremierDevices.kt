package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * PREMIER device specifications for Android Compose previews.
 *
 * This extension provides PREMIER device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Premier.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Premier: Any
  get() = object {
      /** PREMIER ikebukuro */
      val IKEBUKURO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** PREMIER longshan */
      val LONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** PREMIER MAXI_20 */
      val MAXI_20 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** PREMIER redwood */
      val REDWOOD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** PREMIER samseong */
      val SAMSEONG = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
