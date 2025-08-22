package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SKYLIFE device specifications for Android Compose previews.
 *
 * This extension provides SKYLIFE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SKYLIFE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SKYLIFE: Any
  get() = object {
      /** DeviceSpec(manufacturer=SKYLIFE, code=DMTS17SS, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKYLIFE, code=DMTS17SS, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val DMTS17SS = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SKYLIFE, code=DMTS18SS, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKYLIFE, code=DMTS18SS, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DMTS18SS = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SKYLIFE, code=INTEKS19SS, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKYLIFE, code=INTEKS19SS,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val INTEKS19SS = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SKYLIFE, code=INTEKS22SS, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKYLIFE, code=INTEKS22SS,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val INTEKS22SS = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SKYLIFE, code=MA5000, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKYLIFE, code=MA5000, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val MA5000 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
