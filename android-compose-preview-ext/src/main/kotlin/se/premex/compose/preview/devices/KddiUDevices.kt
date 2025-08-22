package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * KDDI_u device specifications for Android Compose previews.
 *
 * This extension provides KDDI_u device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KddiU.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KddiU: Any
  get() = object {
      /** KDDI_u FSP_u */
      val FSP_U = "spec:width=720,height=1280,unit=px,dpi=320"

      /** KDDI_u KXU_u */
      val KXU_U = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** KDDI_u MZW-u */
      val MZW_U = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** KDDI_u PCZ-u */
      val PCZ_U = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** KDDI_u SCV43-u */
      val SCV43_U = "spec:width=1080,height=2340,unit=px,dpi=420"

  }
