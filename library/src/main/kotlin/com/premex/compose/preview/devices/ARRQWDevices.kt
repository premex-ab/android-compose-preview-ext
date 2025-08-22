package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ARRQW device specifications for Android Compose previews.
 *
 * This extension provides ARRQW device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ARRQW.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ARRQW: Any
  get() = object {
      /** ARRQW longshan */
      val LONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ARRQW samseong */
      val SAMSEONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ARRQW yeongdeungpo */
      val YEONGDEUNGPO = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
