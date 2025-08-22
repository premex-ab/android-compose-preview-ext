package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BAUHN device specifications for Android Compose previews.
 *
 * This extension provides BAUHN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Bauhn.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Bauhn: Any
  get() = object {
      /** BAUHN ATAB10-1224 */
      val ATAB10_1224 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** BAUHN ATAB7-0125 */
      val ATAB7_0125 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** BAUHN bangbae */
      val BANGBAE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** BAUHN gangbyeon */
      val GANGBYEON = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** BAUHN komagome */
      val KOMAGOME = "spec:width=720,height=1280,unit=px,dpi=213"

      /** BAUHN longshan */
      val LONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** BAUHN redwood */
      val REDWOOD = "spec:width=720,height=1280,unit=px,dpi=213"

  }
