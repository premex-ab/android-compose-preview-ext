package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * WOXTER device specifications for Android Compose previews.
 *
 * This extension provides WOXTER device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.WOXTER.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.WOXTER: Any
  get() = object {
      /** DeviceSpec(manufacturer=WOXTER, code=X100v3, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WOXTER, code=X100v3, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val X100V3 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=WOXTER, code=X100_PRO, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WOXTER, code=X100_PRO, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val X100_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=WOXTER, code=X200, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WOXTER, code=X200, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val X200 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=WOXTER, code=X200_PRO_v2, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WOXTER, code=X200_PRO_v2,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val X200_PRO_V2 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=WOXTER, code=X70v2, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WOXTER, code=X70v2, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val X70V2 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=WOXTER, code=X70_PRO, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WOXTER, code=X70_PRO, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val X70_PRO = "spec:width=600,height=1024,unit=px,dpi=160"

  }
