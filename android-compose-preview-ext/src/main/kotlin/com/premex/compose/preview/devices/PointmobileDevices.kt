package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * POINTMOBILE device specifications for Android Compose previews.
 *
 * This extension provides POINTMOBILE device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Pointmobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Pointmobile: Any
  get() = object {
      /** POINTMOBILE pm30 */
      val PM30 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** POINTMOBILE PM351 */
      val PM351 = "spec:width=480,height=800,unit=px,dpi=240"

      /** POINTMOBILE PM352 */
      val PM352 = "spec:width=480,height=800,unit=px,dpi=200"

      /** POINTMOBILE pm45 */
      val PM45 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** POINTMOBILE PM451 */
      val PM451 = "spec:width=480,height=800,unit=px,dpi=240"

      /** POINTMOBILE PM452 */
      val PM452 = "spec:width=480,height=800,unit=px,dpi=200"

      /** POINTMOBILE pm550 */
      val PM550 = "spec:width=480,height=800,unit=px,dpi=240"

      /** POINTMOBILE pm66 */
      val PM66 = "spec:width=480,height=800,unit=px,dpi=240"

      /** POINTMOBILE PM67 */
      val PM67 = "spec:width=480,height=800,unit=px,dpi=240"

      /** POINTMOBILE PM75 */
      val PM75 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** POINTMOBILE pm80 */
      val PM80 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** POINTMOBILE PM84 */
      val PM84 = "spec:width=720,height=1440,unit=px,dpi=280"

      /** POINTMOBILE pm85 */
      val PM85 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** POINTMOBILE PM86 */
      val PM86 = "spec:width=1080,height=1920,unit=px,dpi=440"

      /** POINTMOBILE pm90 */
      val PM90 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** POINTMOBILE PM95 */
      val PM95 = "spec:width=1080,height=2160,unit=px,dpi=400"

      /** POINTMOBILE PT11 */
      val PT11 = "spec:width=1200,height=2000,unit=px,dpi=240"

  }
