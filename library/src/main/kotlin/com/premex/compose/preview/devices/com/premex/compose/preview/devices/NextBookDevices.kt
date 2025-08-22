package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NextBook device specifications for Android Compose previews.
 *
 * This extension provides NextBook device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NextBook.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NextBook: Any
  get() = object {
      /** DeviceSpec(manufacturer=NextBook, code=NX16A10132S, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NextBook, code=NX16A10132S,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val NX16A10132S = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=NextBook, code=NX16A10132SPS, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NextBook, code=NX16A10132SPS,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val NX16A10132SPS = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=NextBook, code=NX16A11264, width=768, height=1366, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NextBook, code=NX16A11264,
      width=768, height=1366, dpi=160, isGoogleDevice=false).code */
      val NX16A11264 = "spec:width=768,height=1366,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=NextBook, code=NX16A8116K, width=1440, height=3120, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NextBook, code=NX16A8116K,
      width=1440, height=3120, dpi=560, isGoogleDevice=false).code */
      val NX16A8116K = "spec:width=1440,height=3120,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=NextBook, code=NX16A8116KP, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NextBook, code=NX16A8116KP,
      width=800, height=1280, dpi=240, isGoogleDevice=false).code */
      val NX16A8116KP = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=NextBook, code=NXA116QC164, width=768, height=1366, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NextBook, code=NXA116QC164,
      width=768, height=1366, dpi=160, isGoogleDevice=false).code */
      val NXA116QC164 = "spec:width=768,height=1366,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=NextBook, code=NXA8QC116, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NextBook, code=NXA8QC116,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val NXA8QC116 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
