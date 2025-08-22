package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CWOWDEFU device specifications for Android Compose previews.
 *
 * This extension provides CWOWDEFU device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CWOWDEFU.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CWOWDEFU: Any
  get() = object {
      /** CWOWDEFU C10W_EEA */
      val C10W_EEA = "spec:width=800,height=1280,unit=px,dpi=180"

      /** CWOWDEFU C18W */
      val C18W = "spec:width=800,height=1280,unit=px,dpi=160"

      /** CWOWDEFU C18W_EEA */
      val C18W_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** CWOWDEFU C28 */
      val C28 = "spec:width=600,height=1024,unit=px,dpi=200"

      /** CWOWDEFU C6 */
      val C6 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** CWOWDEFU C73W */
      val C73W = "spec:width=600,height=1024,unit=px,dpi=160"

      /** CWOWDEFU C77W */
      val C77W = "spec:width=600,height=1024,unit=px,dpi=160"

      /** CWOWDEFU C77W_EEA */
      val C77W_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** CWOWDEFU C80W */
      val C80W = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** CWOWDEFU C82W */
      val C82W = "spec:width=800,height=1280,unit=px,dpi=213"

      /** CWOWDEFU C82W_EEA */
      val C82W_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** CWOWDEFU C84W */
      val C84W = "spec:width=800,height=1280,unit=px,dpi=180"

      /** CWOWDEFU C86W */
      val C86W = "spec:width=800,height=1280,unit=px,dpi=213"

      /** CWOWDEFU C86W_EEA */
      val C86W_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** CWOWDEFU F13W */
      val F13W = "spec:width=800,height=1280,unit=px,dpi=213"

      /** CWOWDEFU F13W_EEA */
      val F13W_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** CWOWDEFU F35W */
      val F35W = "spec:width=800,height=1333,unit=px,dpi=160"

      /** CWOWDEFU F80L */
      val F80L = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** CWOWDEFU F80W */
      val F80W = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** CWOWDEFU F80W_EEA */
      val F80W_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** CWOWDEFU F81L */
      val F81L = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** CWOWDEFU P12W */
      val P12W = "spec:width=800,height=1280,unit=px,dpi=160"

      /** CWOWDEFU P12W_EEA */
      val P12W_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** CWOWDEFU P15W */
      val P15W = "spec:width=800,height=1280,unit=px,dpi=160"

      /** CWOWDEFU P15W_EEA */
      val P15W_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** CWOWDEFU P16-C */
      val P16_C = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** CWOWDEFU P25L */
      val P25L = "spec:width=800,height=1280,unit=px,dpi=240"

      /** CWOWDEFU P35W */
      val P35W = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** CWOWDEFU P35W_EEA */
      val P35W_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** CWOWDEFU P38W */
      val P38W = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** CWOWDEFU P38W_EEA */
      val P38W_EEA = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** CWOWDEFU P50L_EEA */
      val P50L_EEA = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** CWOWDEFU P80L */
      val P80L = "spec:width=800,height=1280,unit=px,dpi=240"

      /** CWOWDEFU S18 */
      val S18 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** CWOWDEFU S28 */
      val S28 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
