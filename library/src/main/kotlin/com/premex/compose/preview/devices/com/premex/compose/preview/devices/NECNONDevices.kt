package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NECNON device specifications for Android Compose previews.
 *
 * This extension provides NECNON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NECNON.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NECNON: Any
  get() = object {
      /** DeviceSpec(manufacturer=NECNON, code=M002K-2, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NECNON, code=M002K-2, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val M002K_2 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=NECNON, code=M002K_2, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NECNON, code=M002K_2, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val M002K_2 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=NECNON, code=M002N-3T, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NECNON, code=M002N-3T, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val M002N_3T = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=NECNON, code=M002Q-2, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NECNON, code=M002Q-2, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val M002Q_2 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=NECNON, code=M002U_2T, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NECNON, code=M002U_2T, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val M002U_2T = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=NECNON, code=3L-2, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NECNON, code=3L-2, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val _3L_2 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
