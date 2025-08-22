package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KaonMedia device specifications for Android Compose previews.
 *
 * This extension provides KaonMedia device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KaonMedia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KaonMedia: Any
  get() = object {
      /** DeviceSpec(manufacturer=KaonMedia, code=BKO-AT800, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KaonMedia, code=BKO-AT800,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val BKO_AT800 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KaonMedia, code=IC1110, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KaonMedia, code=IC1110, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val IC1110 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KaonMedia, code=KM_SH368AT, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KaonMedia, code=KM_SH368AT,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val KM_SH368AT = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KaonMedia, code=KSTB2019, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KaonMedia, code=KSTB2019,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val KSTB2019 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KaonMedia, code=KSTB2020, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KaonMedia, code=KSTB2020,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val KSTB2020 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KaonMedia, code=KSTB2100, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KaonMedia, code=KSTB2100,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val KSTB2100 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KaonMedia, code=KSTB4252, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KaonMedia, code=KSTB4252,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val KSTB4252 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KaonMedia, code=KSTB5043, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KaonMedia, code=KSTB5043,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val KSTB5043 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KaonMedia, code=KSTB6020, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KaonMedia, code=KSTB6020,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val KSTB6020 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KaonMedia, code=KSTB6043, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KaonMedia, code=KSTB6043,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val KSTB6043 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KaonMedia, code=KSTB6077, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KaonMedia, code=KSTB6077,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val KSTB6077 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KaonMedia, code=KSTB6130, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KaonMedia, code=KSTB6130,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val KSTB6130 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KaonMedia, code=SFCSTB2LITE, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KaonMedia, code=SFCSTB2LITE,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val SFCSTB2LITE = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
