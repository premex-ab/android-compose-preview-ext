package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FACETEL device specifications for Android Compose previews.
 *
 * This extension provides FACETEL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FACETEL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FACETEL: Any
  get() = object {
      /** DeviceSpec(manufacturer=FACETEL, code=Q10-EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FACETEL, code=Q10-EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val Q10_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=FACETEL, code=Q10-Pro, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FACETEL, code=Q10-Pro, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val Q10_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=FACETEL, code=Q10_T_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FACETEL, code=Q10_T_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val Q10_T_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=FACETEL, code=Q10_T_US, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FACETEL, code=Q10_T_US, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val Q10_T_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=FACETEL, code=Q10-US, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FACETEL, code=Q10-US, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val Q10_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=FACETEL, code=Q3pro, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FACETEL, code=Q3pro, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val Q3PRO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=FACETEL, code=Q3pro_eea, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FACETEL, code=Q3pro_eea, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val Q3PRO_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=FACETEL, code=Q3-EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FACETEL, code=Q3-EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val Q3_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=FACETEL, code=Q3_pro, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FACETEL, code=Q3_pro, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val Q3_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=FACETEL, code=Q6_US, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FACETEL, code=Q6_US, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val Q6_US = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=FACETEL, code=Q7_EEA, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FACETEL, code=Q7_EEA, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val Q7_EEA = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=FACETEL, code=Q7_US, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FACETEL, code=Q7_US, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val Q7_US = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=FACETEL, code=W3_T_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FACETEL, code=W3_T_EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val W3_T_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=FACETEL, code=W3_T_US, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FACETEL, code=W3_T_US, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val W3_T_US = "spec:width=800,height=1280,unit=px,dpi=213"

  }
