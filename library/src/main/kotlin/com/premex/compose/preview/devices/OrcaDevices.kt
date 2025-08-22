package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ORCA device specifications for Android Compose previews.
 *
 * This extension provides ORCA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Orca.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Orca: Any
  get() = object {
      /** ORCA kenton */
      val KENTON = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ORCA lasalle */
      val LASALLE = "spec:width=720,height=1280,unit=px,dpi=213"

      /** ORCA samseong */
      val SAMSEONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ORCA yeongdeungpo */
      val YEONGDEUNGPO = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
