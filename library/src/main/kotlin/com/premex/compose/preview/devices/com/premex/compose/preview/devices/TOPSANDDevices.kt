package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TOPSAND device specifications for Android Compose previews.
 *
 * This extension provides TOPSAND device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TOPSAND.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TOPSAND: Any
  get() = object {
      /** DeviceSpec(manufacturer=TOPSAND, code=G12_A14, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOPSAND, code=G12_A14, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val G12_A14 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TOPSAND, code=M8_U, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOPSAND, code=M8_U, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val M8_U = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=TOPSAND, code=N8_KIDS, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOPSAND, code=N8_KIDS, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val N8_KIDS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=TOPSAND, code=N8_Plus, width=800, height=1340, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOPSAND, code=N8_Plus, width=800,
      height=1340, dpi=213, isGoogleDevice=false).code */
      val N8_PLUS = "spec:width=800,height=1340,unit=px,dpi=213"

  }
