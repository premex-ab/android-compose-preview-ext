package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MASTER-G device specifications for Android Compose previews.
 *
 * This extension provides MASTER-G device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MASTERG.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MASTERG: Any
  get() = object {
      /** DeviceSpec(manufacturer=MASTER-G, code=hongkong, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MASTER-G, code=hongkong,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val HONGKONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MASTER-G, code=lavender, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MASTER-G, code=lavender,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val LAVENDER = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MASTER-G, code=martin, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MASTER-G, code=martin, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MARTIN = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MASTER-G, code=mountbaker, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MASTER-G, code=mountbaker,
      width=720, height=1280, dpi=213, isGoogleDevice=false).code */
      val MOUNTBAKER = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MASTER-G, code=patrick, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MASTER-G, code=patrick, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val PATRICK = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MASTER-G, code=R1, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MASTER-G, code=R1, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val R1 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MASTER-G, code=R10G, width=2160, height=3840, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MASTER-G, code=R10G, width=2160,
      height=3840, dpi=320, isGoogleDevice=false).code */
      val R10G = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MASTER-G, code=R2, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MASTER-G, code=R2, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val R2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MASTER-G, code=R3_GTV, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MASTER-G, code=R3_GTV, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val R3_GTV = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MASTER-G, code=R4_GTV, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MASTER-G, code=R4_GTV, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val R4_GTV = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
