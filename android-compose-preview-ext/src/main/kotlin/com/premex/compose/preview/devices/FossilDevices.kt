package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Fossil device specifications for Android Compose previews.
 *
 * This extension provides Fossil device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Fossil.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Fossil: Any
  get() = object {
      /** Fossil gila */
      val GILA = "spec:width=416,height=416,unit=px,dpi=320"

      /** Fossil hoki */
      val HOKI = "spec:width=416,height=416,unit=px,dpi=320"

      /** Fossil sole */
      val SOLE = "spec:width=390,height=390,unit=px,dpi=320"

  }
