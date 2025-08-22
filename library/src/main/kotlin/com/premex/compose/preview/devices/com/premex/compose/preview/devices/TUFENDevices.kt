package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TUFEN device specifications for Android Compose previews.
 *
 * This extension provides TUFEN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TUFEN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TUFEN: Any
  get() = object {
      /** DeviceSpec(manufacturer=TUFEN, code=Q718B_EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TUFEN, code=Q718B_EEA, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val Q718B_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TUFEN, code=Q738, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TUFEN, code=Q738, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val Q738 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TUFEN, code=Q88C, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TUFEN, code=Q88C, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val Q88C = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TUFEN, code=Q88D_FUFEN_EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TUFEN, code=Q88D_FUFEN_EEA,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val Q88D_FUFEN_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

  }
