package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VENTURER device specifications for Android Compose previews.
 *
 * This extension provides VENTURER device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VENTURER.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VENTURER: Any
  get() = object {
      /** VENTURER CT9A03W23 */
      val CT9A03W23 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** VENTURER CT9A06P23 */
      val CT9A06P23 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** VENTURER VCT9B06Q22 */
      val VCT9B06Q22 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** VENTURER VCT9B06Q23 */
      val VCT9B06Q23 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** VENTURER VCT9B06Q23EU */
      val VCT9B06Q23EU = "spec:width=800,height=1280,unit=px,dpi=160"

      /** VENTURER VCT9F0A68R23EU */
      val VCT9F0A68R23EU = "spec:width=800,height=1280,unit=px,dpi=160"

      /** VENTURER VCT9F78Q22 */
      val VCT9F78Q22 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** VENTURER VCT9F78Q22EU */
      val VCT9F78Q22EU = "spec:width=600,height=1024,unit=px,dpi=160"

      /** VENTURER VCT9F78Q22-A0 */
      val VCT9F78Q22_A0 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** VENTURER VCT9F78Q22-A1 */
      val VCT9F78Q22_A1 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** VENTURER VCT9F78Q22-E */
      val VCT9F78Q22_E = "spec:width=600,height=1024,unit=px,dpi=160"

      /** VENTURER VCT9F8A68RD */
      val VCT9F8A68RD = "spec:width=800,height=1280,unit=px,dpi=160"

      /** VENTURER VCT9T48Q34 */
      val VCT9T48Q34 = "spec:width=1080,height=1920,unit=px,dpi=213"

      /** VENTURER VCT9T48Q34EU */
      val VCT9T48Q34EU = "spec:width=1080,height=1920,unit=px,dpi=213"

  }
