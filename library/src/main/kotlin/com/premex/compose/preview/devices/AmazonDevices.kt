package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Amazon device specifications for Android Compose previews.
 *
 * This extension provides Amazon device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Amazon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Amazon: Any
  get() = object {
      /** Amazon douglas */
      val DOUGLAS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Amazon karnak */
      val KARNAK = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Amazon maverick */
      val MAVERICK = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Amazon mustang */
      val MUSTANG = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Amazon onyx */
      val ONYX = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Amazon suez */
      val SUEZ = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Amazon trona */
      val TRONA = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
