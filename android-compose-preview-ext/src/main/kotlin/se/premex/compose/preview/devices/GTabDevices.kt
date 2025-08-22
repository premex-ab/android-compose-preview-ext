package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * G-tab device specifications for Android Compose previews.
 *
 * This extension provides G-tab device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GTab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GTab: Any
  get() = object {
      /** G-tab F10 */
      val F10 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** G-tab Q5 */
      val Q5 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** G-tab S3 */
      val S3 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** G-tab Tablet */
      val TABLET = "spec:width=800,height=1280,unit=px,dpi=213"

  }
