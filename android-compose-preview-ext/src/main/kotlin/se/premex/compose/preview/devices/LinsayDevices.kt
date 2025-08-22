package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * LINSAY device specifications for Android Compose previews.
 *
 * This extension provides LINSAY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Linsay.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Linsay: Any
  get() = object {
      /** LINSAY F10XIPG */
      val F10XIPG = "spec:width=800,height=1280,unit=px,dpi=213"

      /** LINSAY F10XIPS */
      val F10XIPS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** LINSAY F10XIPSQ */
      val F10XIPSQ = "spec:width=800,height=1280,unit=px,dpi=160"

      /** LINSAY F7UHD */
      val F7UHD = "spec:width=600,height=1024,unit=px,dpi=160"

      /** LINSAY F_10XIPS */
      val F_10XIPS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** LINSAY LINSAY-F7HD4CORE */
      val LINSAY_F7HD4CORE = "spec:width=600,height=1024,unit=px,dpi=160"

  }
