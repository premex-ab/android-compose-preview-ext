package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Proximus device specifications for Android Compose previews.
 *
 * This extension provides Proximus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Proximus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Proximus: Any
  get() = object {
      /** DeviceSpec(manufacturer=Proximus, code=uiw4020pxm, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Proximus, code=uiw4020pxm,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val UIW4020PXM = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Proximus, code=uiw4068pxm, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Proximus, code=uiw4068pxm,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val UIW4068PXM = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
