package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * isafe device specifications for Android Compose previews.
 *
 * This extension provides isafe device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Isafe.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Isafe: Any
  get() = object {
      /** isafe IS520_1 */
      val IS520_1 = "spec:width=480,height=854,unit=px,dpi=240"

      /** isafe IS910_1 */
      val IS910_1 = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
