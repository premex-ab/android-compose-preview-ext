package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * itel device specifications for Android Compose previews.
 *
 * This extension provides itel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Itel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Itel: Any
  get() = object {
      /** itel barking */
      val BARKING = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** itel beaudry */
      val BEAUDRY = "spec:width=720,height=1280,unit=px,dpi=213"

      /** itel ikebukuro */
      val IKEBUKURO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** itel itel-Pad-2 */
      val ITEL_PAD_2 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** itel redwood */
      val REDWOOD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** itel samseong */
      val SAMSEONG = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
