package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Kurio device specifications for Android Compose previews.
 *
 * This extension provides Kurio device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Kurio.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Kurio: Any
  get() = object {
      /** Kurio Aquaman_10_WIFI */
      val AQUAMAN_10_WIFI = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Kurio Hulk_7_KIDS_WIFI */
      val HULK_7_KIDS_WIFI = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Kurio K01023 */
      val K01023 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Kurio K01023US */
      val K01023US = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Kurio K01524 */
      val K01524 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Kurio Phoenix_7_KD */
      val PHOENIX_7_KD = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Kurio Pixi4-7_WIFI_KD */
      val PIXI4_7_WIFI_KD = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Kurio U3A_10_WIFI_KD */
      val U3A_10_WIFI_KD = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Kurio U3A_7_WIFI_Refresh_KD */
      val U3A_7_WIFI_REFRESH_KD = "spec:width=600,height=1024,unit=px,dpi=160"

  }
