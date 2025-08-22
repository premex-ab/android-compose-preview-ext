package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DREAMTECH device specifications for Android Compose previews.
 *
 * This extension provides DREAMTECH device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DREAMTECH.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DREAMTECH: Any
  get() = object {
      /** DREAMTECH DTECH10 */
      val DTECH10 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DREAMTECH KIDDOTAB10 */
      val KIDDOTAB10 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DREAMTECH STARPAD */
      val STARPAD = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DREAMTECH STARPAD_PLUS */
      val STARPAD_PLUS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DREAMTECH VOLTA_X */
      val VOLTA_X = "spec:width=800,height=1280,unit=px,dpi=213"

  }
