package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MIRO device specifications for Android Compose previews.
 *
 * This extension provides MIRO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MIRO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MIRO: Any
  get() = object {
      /** DeviceSpec(manufacturer=MIRO, code=A1, width=576, height=1152, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MIRO, code=A1, width=576,
      height=1152, dpi=220, isGoogleDevice=false).code */
      val A1 = "spec:width=576,height=1152,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=MIRO, code=Miro_S67, width=720, height=1600, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MIRO, code=Miro_S67, width=720,
      height=1600, dpi=480, isGoogleDevice=false).code */
      val MIRO_S67 = "spec:width=720,height=1600,unit=px,dpi=480"

  }
