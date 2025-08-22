package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CEPTER device specifications for Android Compose previews.
 *
 * This extension provides CEPTER device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CEPTER.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CEPTER: Any
  get() = object {
      /** DeviceSpec(manufacturer=CEPTER, code=burbank, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CEPTER, code=burbank, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val BURBANK = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CEPTER, code=CEPTERTAB101, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CEPTER, code=CEPTERTAB101,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val CEPTERTAB101 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=CEPTER, code=CEPTERTAB1095, width=1200, height=2000, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CEPTER, code=CEPTERTAB1095,
      width=1200, height=2000, dpi=213, isGoogleDevice=false).code */
      val CEPTERTAB1095 = "spec:width=1200,height=2000,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=CEPTER, code=CEPTERTAB10E, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CEPTER, code=CEPTERTAB10E,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val CEPTERTAB10E = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=CEPTER, code=CEPTERTABP12, width=1600, height=2560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CEPTER, code=CEPTERTABP12,
      width=1600, height=2560, dpi=320, isGoogleDevice=false).code */
      val CEPTERTABP12 = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CEPTER, code=CEPTER-TAB-10L, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CEPTER, code=CEPTER-TAB-10L,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val CEPTER_TAB_10L = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=CEPTER, code=CEPTER-TAB-10S, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CEPTER, code=CEPTER-TAB-10S,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val CEPTER_TAB_10S = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=CEPTER, code=CTABERA101, width=800, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CEPTER, code=CTABERA101, width=800,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val CTABERA101 = "spec:width=800,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CEPTER, code=CTABEVOP12, width=1600, height=2560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CEPTER, code=CTABEVOP12,
      width=1600, height=2560, dpi=320, isGoogleDevice=false).code */
      val CTABEVOP12 = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CEPTER, code=CTABNEXUS, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CEPTER, code=CTABNEXUS, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val CTABNEXUS = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=CEPTER, code=CTABTERRA128, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CEPTER, code=CTABTERRA128,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val CTABTERRA128 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=CEPTER, code=CTABTERRA256, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CEPTER, code=CTABTERRA256,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val CTABTERRA256 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=CEPTER, code=CTABTITAN12, width=1600, height=2560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CEPTER, code=CTABTITAN12,
      width=1600, height=2560, dpi=320, isGoogleDevice=false).code */
      val CTABTITAN12 = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CEPTER, code=lakeside, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CEPTER, code=lakeside, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val LAKESIDE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CEPTER, code=nagai, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CEPTER, code=nagai, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val NAGAI = "spec:width=720,height=1280,unit=px,dpi=213"

  }
