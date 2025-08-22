package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SELECLINE device specifications for Android Compose previews.
 *
 * This extension provides SELECLINE device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SELECLINE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SELECLINE: Any
  get() = object {
      /** SELECLINE S3T10IN */
      val S3T10IN = "spec:width=600,height=1024,unit=px,dpi=160"

      /** SELECLINE S5S5IN4G */
      val S5S5IN4G = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** SELECLINE S5T10IN */
      val S5T10IN = "spec:width=600,height=1024,unit=px,dpi=160"

      /** SELECLINE ST19101 */
      val ST19101 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
