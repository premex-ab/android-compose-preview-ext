package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * myphone device specifications for Android Compose previews.
 *
 * This extension provides myphone device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Myphone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Myphone: Any
  get() = object {
      /** myphone V4701_I01 */
      val V4701_I01 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
