package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Cellution device specifications for Android Compose previews.
 *
 * This extension provides Cellution device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Cellution.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Cellution: Any
  get() = object {
      /** DeviceSpec(manufacturer=Cellution, code=Cosmas, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cellution, code=Cosmas, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val COSMAS = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Cellution, code=COSMAS_T, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cellution, code=COSMAS_T,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val COSMAS_T = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Cellution, code=COSMAS_TF, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cellution, code=COSMAS_TF,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val COSMAS_TF = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Cellution, code=COSMAS_X, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cellution, code=COSMAS_X,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val COSMAS_X = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Cellution, code=CT_Cosmas_V, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cellution, code=CT_Cosmas_V,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val CT_COSMAS_V = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Cellution, code=IRIS, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cellution, code=IRIS, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val IRIS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Cellution, code=PADUA, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cellution, code=PADUA, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val PADUA = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Cellution, code=PADUA_1, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cellution, code=PADUA_1, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val PADUA_1 = "spec:width=480,height=960,unit=px,dpi=240"

  }
