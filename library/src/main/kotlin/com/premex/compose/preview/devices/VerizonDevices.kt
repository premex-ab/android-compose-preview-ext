package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * verizon device specifications for Android Compose previews.
 *
 * This extension provides verizon device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Verizon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Verizon: Any
  get() = object {
      /** verizon D6708 */
      val D6708 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** verizon dorado */
      val DORADO = "spec:width=400,height=400,unit=px,dpi=280"

      /** verizon SGP561 */
      val SGP561 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** verizon stingray */
      val STINGRAY = "spec:width=752,height=1280,unit=px,dpi=160"

  }
