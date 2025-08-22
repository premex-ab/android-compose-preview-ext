package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LASER device specifications for Android Compose previews.
 *
 * This extension provides LASER device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LASER.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LASER: Any
  get() = object {
      /** LASER MID-104GB-968 */
      val MID_104GB_968 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** LASER MID-1087 */
      val MID_1087 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** LASER MID-1090IPS */
      val MID_1090IPS = "spec:width=800,height=1280,unit=px,dpi=160"

      /** LASER MID_1099IPS */
      val MID_1099IPS = "spec:width=800,height=1280,unit=px,dpi=160"

      /** LASER MID_1099IPS_V13 */
      val MID_1099IPS_V13 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** LASER MID_787V9 */
      val MID_787V9 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** LASER MID_799IPS */
      val MID_799IPS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** LASER MID_799IPS_V13 */
      val MID_799IPS_V13 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** LASER MID_899IPS */
      val MID_899IPS = "spec:width=800,height=1280,unit=px,dpi=180"

  }
