package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * insignia device specifications for Android Compose previews.
 *
 * This extension provides insignia device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Insignia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Insignia: Any
  get() = object {
      /** DeviceSpec(manufacturer=insignia, code=NS-P10A6100, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=insignia, code=NS-P10A6100,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val NS_P10A6100 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=insignia, code=NS-P11A8100, width=768, height=1366, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=insignia, code=NS-P11A8100,
      width=768, height=1366, dpi=160, isGoogleDevice=false).code */
      val NS_P11A8100 = "spec:width=768,height=1366,unit=px,dpi=160"

  }
