package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ASTECH device specifications for Android Compose previews.
 *
 * This extension provides ASTECH device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Astech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Astech: Any
  get() = object {
      /** ASTECH Astech_IRIS */
      val ASTECH_IRIS = "spec:width=720,height=1612,unit=px,dpi=280"

      /** ASTECH Astech_S7 */
      val ASTECH_S7 = "spec:width=720,height=1612,unit=px,dpi=280"

      /** ASTECH Astech_S8 */
      val ASTECH_S8 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** ASTECH Astech_S9 */
      val ASTECH_S9 = "spec:width=720,height=1612,unit=px,dpi=280"

      /** ASTECH R10G */
      val R10G = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** ASTECH R3 */
      val R3 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** ASTECH R3_GTV */
      val R3_GTV = "spec:width=720,height=1280,unit=px,dpi=213"

      /** ASTECH R4 */
      val R4 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ASTECH tamachi */
      val TAMACHI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** ASTECH yeongdeungpo */
      val YEONGDEUNGPO = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
