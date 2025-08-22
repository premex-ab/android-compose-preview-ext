package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * iKU device specifications for Android Compose previews.
 *
 * This extension provides iKU device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IKU.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IKU: Any
  get() = object {
      /** DeviceSpec(manufacturer=iKU, code=A10, width=600, height=1280, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iKU, code=A10, width=600,
      height=1280, dpi=280, isGoogleDevice=false).code */
      val A10 = "spec:width=600,height=1280,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=iKU, code=A21, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iKU, code=A21, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val A21 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=iKU, code=A23, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iKU, code=A23, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val A23 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=iKU, code=A35, width=540, height=1200, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iKU, code=A35, width=540,
      height=1200, dpi=240, isGoogleDevice=false).code */
      val A35 = "spec:width=540,height=1200,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=iKU, code=A36, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iKU, code=A36, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val A36 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=iKU, code=A45, width=540, height=1200, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iKU, code=A45, width=540,
      height=1200, dpi=240, isGoogleDevice=false).code */
      val A45 = "spec:width=540,height=1200,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=iKU, code=A50, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iKU, code=A50, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val A50 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=iKU, code=A6, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iKU, code=A6, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val A6 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=iKU, code=A70, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iKU, code=A70, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val A70 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=iKU, code=iKU_A22, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iKU, code=iKU_A22, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val IKU_A22 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=iKU, code=T1, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iKU, code=T1, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val T1 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=iKU, code=T6, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iKU, code=T6, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val T6 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=iKU, code=T8, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iKU, code=T8, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val T8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=iKU, code=X1, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iKU, code=X1, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val X1 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=iKU, code=X2, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iKU, code=X2, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val X2 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=iKU, code=X3, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iKU, code=X3, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val X3 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=iKU, code=X4, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iKU, code=X4, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val X4 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=iKU, code=X5, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iKU, code=X5, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val X5 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=iKU, code=Y2, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iKU, code=Y2, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val Y2 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=iKU, code=Y3, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iKU, code=Y3, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val Y3 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=iKU, code=Y7, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iKU, code=Y7, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val Y7 = "spec:width=720,height=1520,unit=px,dpi=320"

  }
