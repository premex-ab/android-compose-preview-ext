package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Vortex device specifications for Android Compose previews.
 *
 * This extension provides Vortex device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Vortex.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Vortex: Any
  get() = object {
      /** Vortex A24 */
      val A24 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** Vortex C24L */
      val C24L = "spec:width=480,height=960,unit=px,dpi=200"

      /** Vortex CB68 */
      val CB68 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** Vortex CG65 */
      val CG65 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Vortex G8 */
      val G8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Vortex HD55 */
      val HD55 = "spec:width=480,height=960,unit=px,dpi=200"

      /** Vortex HD60 */
      val HD60 = "spec:width=480,height=960,unit=px,dpi=213"

      /** Vortex HD60i */
      val HD60I = "spec:width=480,height=960,unit=px,dpi=200"

      /** Vortex HD60L */
      val HD60L = "spec:width=480,height=960,unit=px,dpi=200"

      /** Vortex HD62 */
      val HD62 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Vortex HD65 */
      val HD65 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Vortex HD65_PLUS */
      val HD65_PLUS = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Vortex HD65_Select */
      val HD65_SELECT = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Vortex HD65_Ultra */
      val HD65_ULTRA = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Vortex HD67 */
      val HD67 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Vortex J24 */
      val J24 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Vortex MUV */
      val MUV = "spec:width=480,height=854,unit=px,dpi=240"

      /** Vortex NS65 */
      val NS65 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Vortex Sync */
      val SYNC = "spec:width=480,height=960,unit=px,dpi=240"

      /** Vortex T10M_Pro */
      val T10M_PRO = "spec:width=800,height=1280,unit=px,dpi=200"

      /** Vortex TAB8 */
      val TAB8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Vortex V22 */
      val V22 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Vortex V22S */
      val V22S = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Vortex Z22 */
      val Z22 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Vortex Z23 */
      val Z23 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Vortex ZG55 */
      val ZG55 = "spec:width=480,height=960,unit=px,dpi=200"

      /** Vortex ZG65 */
      val ZG65 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Vortex ZG65_Pro */
      val ZG65_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

  }
