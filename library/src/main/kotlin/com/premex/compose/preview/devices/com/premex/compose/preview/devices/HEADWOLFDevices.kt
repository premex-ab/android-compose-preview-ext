package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HEADWOLF device specifications for Android Compose previews.
 *
 * This extension provides HEADWOLF device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HEADWOLF.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HEADWOLF: Any
  get() = object {
      /** DeviceSpec(manufacturer=HEADWOLF, code=F2A, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HEADWOLF, code=F2A, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val F2A = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HEADWOLF, code=F3A, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HEADWOLF, code=F3A, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val F3A = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=HEADWOLF, code=F5A, width=1600, height=2560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HEADWOLF, code=F5A, width=1600,
      height=2560, dpi=320, isGoogleDevice=false).code */
      val F5A = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HEADWOLF, code=F6, width=1600, height=2560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HEADWOLF, code=F6, width=1600,
      height=2560, dpi=320, isGoogleDevice=false).code */
      val F6 = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HEADWOLF, code=F7, width=1600, height=2560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HEADWOLF, code=F7, width=1600,
      height=2560, dpi=320, isGoogleDevice=false).code */
      val F7 = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HEADWOLF, code=Fpad1, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HEADWOLF, code=Fpad1, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val FPAD1 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=HEADWOLF, code=Fpad2, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HEADWOLF, code=Fpad2, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val FPAD2 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=HEADWOLF, code=Fpad3, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HEADWOLF, code=Fpad3, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val FPAD3 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=HEADWOLF, code=Fpad5, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HEADWOLF, code=Fpad5, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val FPAD5 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=HEADWOLF, code=Hpad1, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HEADWOLF, code=Hpad1, width=1200,
      height=2000, dpi=320, isGoogleDevice=false).code */
      val HPAD1 = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HEADWOLF, code=HPAD1A, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HEADWOLF, code=HPAD1A, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val HPAD1A = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=HEADWOLF, code=Hpad2, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HEADWOLF, code=Hpad2, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val HPAD2 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HEADWOLF, code=Hpad3, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HEADWOLF, code=Hpad3, width=1200,
      height=2000, dpi=320, isGoogleDevice=false).code */
      val HPAD3 = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HEADWOLF, code=Hpad5, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HEADWOLF, code=Hpad5, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val HPAD5 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=HEADWOLF, code=HPAD6, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HEADWOLF, code=HPAD6, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val HPAD6 = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=HEADWOLF, code=W5, width=1200, height=1920, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HEADWOLF, code=W5, width=1200,
      height=1920, dpi=213, isGoogleDevice=false).code */
      val W5 = "spec:width=1200,height=1920,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HEADWOLF, code=W5A, width=1200, height=1920, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HEADWOLF, code=W5A, width=1200,
      height=1920, dpi=213, isGoogleDevice=false).code */
      val W5A = "spec:width=1200,height=1920,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HEADWOLF, code=W6A, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HEADWOLF, code=W6A, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val W6A = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=HEADWOLF, code=W7, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HEADWOLF, code=W7, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val W7 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HEADWOLF, code=Wpad1, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HEADWOLF, code=Wpad1, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val WPAD1 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=HEADWOLF, code=WPAD2, width=1200, height=1920, dpi=340,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HEADWOLF, code=WPAD2, width=1200,
      height=1920, dpi=340, isGoogleDevice=false).code */
      val WPAD2 = "spec:width=1200,height=1920,unit=px,dpi=340"

  }
