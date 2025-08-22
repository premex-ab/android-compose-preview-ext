package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PEAQ device specifications for Android Compose previews.
 *
 * This extension provides PEAQ device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PEAQ.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PEAQ: Any
  get() = object {
      /** DeviceSpec(manufacturer=PEAQ, code=PET-1008-F464E, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PEAQ, code=PET-1008-F464E,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val PET_1008_F464E = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=PEAQ, code=PET-1008-H332E, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PEAQ, code=PET-1008-H332E,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val PET_1008_H332E = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PEAQ, code=PET_10180_H464S, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PEAQ, code=PET_10180_H464S,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val PET_10180_H464S = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PEAQ, code=PET-101-F464S, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PEAQ, code=PET-101-F464S,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val PET_101_F464S = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=PEAQ, code=PET-101-H232E, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PEAQ, code=PET-101-H232E,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val PET_101_H232E = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PEAQ, code=PET-101-H332S-W, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PEAQ, code=PET-101-H332S-W,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val PET_101_H332S_W = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PEAQ, code=PET-102-H232S, width=800, height=1332, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PEAQ, code=PET-102-H232S,
      width=800, height=1332, dpi=160, isGoogleDevice=false).code */
      val PET_102_H232S = "spec:width=800,height=1332,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PEAQ, code=PET-10380-H628S, width=800, height=1332, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PEAQ, code=PET-10380-H628S,
      width=800, height=1332, dpi=160, isGoogleDevice=false).code */
      val PET_10380_H628S = "spec:width=800,height=1332,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PEAQ, code=PET-1081-H232S, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PEAQ, code=PET-1081-H232S,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val PET_1081_H232S = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PEAQ, code=PET-1081-LH332S, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PEAQ, code=PET-1081-LH332S,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val PET_1081_LH332S = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PEAQ, code=PET-10980-F628E, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PEAQ, code=PET-10980-F628E,
      width=1200, height=2000, dpi=240, isGoogleDevice=false).code */
      val PET_10980_F628E = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=PEAQ, code=PET_11080-F628S, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PEAQ, code=PET_11080-F628S,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val PET_11080_F628S = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=PEAQ, code=PET_11080_H428S, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PEAQ, code=PET_11080_H428S,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val PET_11080_H428S = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PEAQ, code=PET_8040_H464S, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PEAQ, code=PET_8040_H464S,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val PET_8040_H464S = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PEAQ, code=PET-882-H232S, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PEAQ, code=PET-882-H232S,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val PET_882_H232S = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PEAQ, code=R4_GTV, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PEAQ, code=R4_GTV, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val R4_GTV = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=PEAQ, code=THMTKAW04232, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PEAQ, code=THMTKAW04232, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val THMTKAW04232 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
