package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * blackberry device specifications for Android Compose previews.
 *
 * This extension provides blackberry device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Blackberry.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Blackberry: Any
  get() = object {
      /** blackberry argon */
      val ARGON = "spec:width=1440,height=2560,unit=px,dpi=560"

      /** blackberry bbb100 */
      val BBB100 = "spec:width=1080,height=1620,unit=px,dpi=420"

      /** blackberry bbc100 */
      val BBC100 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** blackberry bbd100 */
      val BBD100 = "spec:width=1080,height=1920,unit=px,dpi=420"

      /** blackberry bbe100 */
      val BBE100 = "spec:width=1080,height=1620,unit=px,dpi=420"

      /** blackberry bbf100 */
      val BBF100 = "spec:width=1080,height=1620,unit=px,dpi=420"

      /** blackberry bbg100 */
      val BBG100 = "spec:width=1080,height=2160,unit=px,dpi=400"

      /** blackberry bbh100 */
      val BBH100 = "spec:width=1080,height=2160,unit=px,dpi=400"

      /** blackberry hamburg */
      val HAMBURG = "spec:width=1080,height=1920,unit=px,dpi=420"

      /** blackberry venice */
      val VENICE = "spec:width=1440,height=2560,unit=px,dpi=560"

  }
