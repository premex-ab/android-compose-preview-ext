package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TELEFUNKEN device specifications for Android Compose previews.
 *
 * This extension provides TELEFUNKEN device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TELEFUNKEN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TELEFUNKEN: Any
  get() = object {
      /** TELEFUNKEN SW4H */
      val SW4H = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** TELEFUNKEN TEL-1013GIQA */
      val TEL_1013GIQA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** TELEFUNKEN TEL-1014GIQ */
      val TEL_1014GIQ = "spec:width=800,height=1280,unit=px,dpi=213"

      /** TELEFUNKEN TEL-1014GIQA */
      val TEL_1014GIQA = "spec:width=800,height=1280,unit=px,dpi=220"

      /** TELEFUNKEN TEL-73GIQA */
      val TEL_73GIQA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** TELEFUNKEN TEL-73GIQA11 */
      val TEL_73GIQA11 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** TELEFUNKEN TEL-74GIQA */
      val TEL_74GIQA = "spec:width=600,height=1024,unit=px,dpi=180"

      /** TELEFUNKEN TF501_EC */
      val TF501_EC = "spec:width=600,height=1024,unit=px,dpi=160"

      /** TELEFUNKEN TF600 */
      val TF600 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
