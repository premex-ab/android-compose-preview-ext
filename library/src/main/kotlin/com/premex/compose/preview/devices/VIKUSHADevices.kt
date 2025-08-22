package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VIKUSHA device specifications for Android Compose previews.
 *
 * This extension provides VIKUSHA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VIKUSHA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VIKUSHA: Any
  get() = object {
      /** VIKUSHA VZ-1 */
      val VZ_1 = "spec:width=600,height=1024,unit=px,dpi=200"

      /** VIKUSHA VZ-30 */
      val VZ_30 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** VIKUSHA VZ-30Pro */
      val VZ_30PRO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** VIKUSHA V-E5 */
      val V_E5 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** VIKUSHA V-N5 */
      val V_N5 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** VIKUSHA V-Z40 */
      val V_Z40 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** VIKUSHA V-Z40Pro */
      val V_Z40PRO = "spec:width=800,height=1280,unit=px,dpi=240"

      /** VIKUSHA V-Z70 */
      val V_Z70 = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** VIKUSHA V-Z80Plus */
      val V_Z80PLUS = "spec:width=1200,height=2000,unit=px,dpi=252"

  }
