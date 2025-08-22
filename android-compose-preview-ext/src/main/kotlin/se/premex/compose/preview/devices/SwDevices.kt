package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * SW device specifications for Android Compose previews.
 *
 * This extension provides SW device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Sw.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Sw: Any
  get() = object {
      /** SW SW3H_ATV */
      val SW3H_ATV = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SW SW3_ATV */
      val SW3_ATV = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SW SW4H */
      val SW4H = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SW SW4H_FF */
      val SW4H_FF = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
