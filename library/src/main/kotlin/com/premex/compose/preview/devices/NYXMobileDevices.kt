package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NYX_Mobile device specifications for Android Compose previews.
 *
 * This extension provides NYX_Mobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NYXMobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NYXMobile: Any
  get() = object {
      /** NYX_Mobile Click */
      val CLICK = "spec:width=480,height=800,unit=px,dpi=240"

      /** NYX_Mobile GLAM */
      val GLAM = "spec:width=720,height=1280,unit=px,dpi=320"

      /** NYX_Mobile KiN */
      val KIN = "spec:width=800,height=1280,unit=px,dpi=213"

      /** NYX_Mobile NYX_SHADE */
      val NYX_SHADE = "spec:width=480,height=854,unit=px,dpi=240"

      /** NYX_Mobile Rex */
      val REX = "spec:width=480,height=854,unit=px,dpi=240"

  }
