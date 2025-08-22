package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EE device specifications for Android Compose previews.
 *
 * This extension provides EE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.EE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.EE: Any
  get() = object {
      /** DeviceSpec(manufacturer=EE, code=harrier_mini, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EE, code=harrier_mini, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val HARRIER_MINI = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=EE, code=Hawk_from_EE, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EE, code=Hawk_from_EE, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val HAWK_FROM_EE = "spec:width=720,height=1280,unit=px,dpi=320"

  }
