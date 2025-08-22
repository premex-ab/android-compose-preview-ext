package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * UAUU device specifications for Android Compose previews.
 *
 * This extension provides UAUU device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.UAUU.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.UAUU: Any
  get() = object {
      /** UAUU M10 */
      val M10 = "spec:width=1536,height=2048,unit=px,dpi=240"

      /** UAUU T30 */
      val T30 = "spec:width=1200,height=1920,unit=px,dpi=304"

      /** UAUU T30Pro */
      val T30PRO = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** UAUU T60 */
      val T60 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** UAUU T90_NEW */
      val T90_NEW = "spec:width=1200,height=1920,unit=px,dpi=272"

      /** UAUU U10 */
      val U10 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
