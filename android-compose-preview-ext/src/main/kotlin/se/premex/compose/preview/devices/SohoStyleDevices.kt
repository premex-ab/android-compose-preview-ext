package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * SOHO_STYLE device specifications for Android Compose previews.
 *
 * This extension provides SOHO_STYLE device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SohoStyle.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SohoStyle: Any
  get() = object {
      /** SOHO_STYLE S1582C */
      val S1582C = "spec:width=480,height=960,unit=px,dpi=213"

      /** SOHO_STYLE S1586K */
      val S1586K = "spec:width=720,height=1440,unit=px,dpi=320"

      /** SOHO_STYLE S65 */
      val S65 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** SOHO_STYLE S6561 */
      val S6561 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** SOHO_STYLE SS5114G */
      val SS5114G = "spec:width=480,height=854,unit=px,dpi=240"

      /** SOHO_STYLE SS5314G */
      val SS5314G = "spec:width=480,height=960,unit=px,dpi=240"

      /** SOHO_STYLE SS5424G */
      val SS5424G = "spec:width=480,height=960,unit=px,dpi=220"

      /** SOHO_STYLE SS5514G */
      val SS5514G = "spec:width=480,height=960,unit=px,dpi=213"

      /** SOHO_STYLE SS5539G */
      val SS5539G = "spec:width=480,height=960,unit=px,dpi=240"

  }
